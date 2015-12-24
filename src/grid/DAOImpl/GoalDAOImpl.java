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

@Repository
public class GoalDAOImpl implements GoalDAO {

	private static final Logger logger	=	LoggerFactory.getLogger(GoalDAOImpl.class);
	private SessionFactory		sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addGoal(Goal g) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.persist(g);
		logger.info("GoalDAOImpl: added a new Goal on persistence layer");
	}

	@Override
	public void updateGoal(Goal g) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.update(g);
		logger.info("GoalDAOImpl: updated a Goal on persistence layer");
	}

	@SuppressWarnings("unchecked")
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
	public List<Goal> getGoalLog(String label) {
		Session session				=	this.sessionFactory.getCurrentSession();
		List<Goal> goalList	=	session.createQuery("from Goal G where G.label = "+label).list();
		for(Goal g : goalList){
			logger.info("Goal List::"+g);
		}
		return goalList;
	}

	@Override
	public void removeGoal(int id) {
		Session session	=	this.sessionFactory.getCurrentSession();
		Goal g			=	(Goal)	session.load(Goal.class, new Integer(id));
		if(g!=null){
			session.delete(g);
		}
		logger.info("GoalDAOImpl Goal deleted successfully");
	}


}
