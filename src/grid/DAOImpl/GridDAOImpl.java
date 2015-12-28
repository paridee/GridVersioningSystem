package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.Goal;
import grid.entities.Grid;
import grid.entities.GridElement;
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
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.persist(g);
		logger.info("GoalDAOImpl: added a new Goal on persistence layer");		
	}

	@Override
	public void updateGrid(Grid g) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.update(g);
		logger.info("updated a "+g.getClass()+" on persistence layer");
	}

	@Override
	public List<Grid> listAllGrids() {
		Session session				=	this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Grid> gridElList	=	session.createQuery("from Grid").list();
		for(Grid g : gridElList){
			logger.info("Grid::"+g);
		}
		return gridElList;
	}

	@Override
	public Grid getGridById(int id) {
		Session currentSession	=	this.sessionFactory.getCurrentSession();
		Grid	g			=	(Grid) currentSession.load(Grid.class,new Integer(id));
		logger.info(g.getClass().getName()+" loaded::"+g);
		return g;
	}

	@Override
	public Grid getLatestGrid(int projid) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Grid> getGridLog(int projid) {
		Session session				=	this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Grid> gridElList	=	session.createQuery("from Grid G where G.projID = "+projid).list();
		for(Grid g : gridElList){
			logger.info("Grid::"+g);
		}
		return gridElList;
	}

	@Override
	public void removeGrid(int id) {
		Session session	=	this.sessionFactory.getCurrentSession();
		Grid	g		=	(Grid)	session.load(Grid.class, new Integer(id));
		if(g!=null){
			session.delete(g);
		}
		logger.info(g.getClass().getName()+" deleted successfully");		
	}

	@Override
	public Grid upgradeGrid(Grid g) {
		Grid upgraded	=	new Grid();
		upgraded.setProject(g.getProject());
		ArrayList<Goal> mainGoals	=	new ArrayList<Goal>();
		List<Goal> oldGoals	=	g.getMainGoals();
		for(int i=0;i<oldGoals.size();i++){
			mainGoals.add(oldGoals.get(i));
		}
		upgraded.setMainGoals(mainGoals);
		upgraded.setVersion(g.getVersion()+1);
		this.addGrid(upgraded);
		return upgraded;
	}


}
