package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.Goal;
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
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.persist(g);
		logger.info("added a new MeasurementGoal on persistence layer");
	}

	@Override
	public void updateGoal(MeasurementGoal g) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.update(g);
		logger.info("GoalDAOImpl: updated a Goal on persistence layer");		
	}

	@Override
	public List<MeasurementGoal> listGoals() {
		Session session				=	this.sessionFactory.getCurrentSession();
		List<MeasurementGoal> goalList	=	session.createQuery("from MeasurementGoal").list();
		for(MeasurementGoal g : goalList){
			logger.info("MeasurementGoal List::"+g);
		}
		return goalList;
	}

	@Override
	public MeasurementGoal getGoalById(int id) {
		Session currentSession	=	this.sessionFactory.getCurrentSession();
		MeasurementGoal	g			=	(MeasurementGoal) currentSession.load(MeasurementGoal.class,new Integer(id));
		logger.info("MeasurementGoal loaded::"+g);
		return g;
	}

	@Override
	public List<MeasurementGoal> getGoalLog(String label) {
		Session session				=	this.sessionFactory.getCurrentSession();
		List<MeasurementGoal> goalList	=	session.createQuery("from MeasurementGoal G where G.label = "+label).list();
		for(MeasurementGoal g : goalList){
			logger.info("Goal List::"+g);
		}
		return goalList;
	}

	@Override
	public void removeGoal(int id) {
		Session session	=	this.sessionFactory.getCurrentSession();
		MeasurementGoal g			=	(MeasurementGoal)	session.load(MeasurementGoal.class, new Integer(id));
		if(g!=null){
			session.delete(g);
		}
		logger.info("MeasurementGoal deleted successfully");
	}


}
