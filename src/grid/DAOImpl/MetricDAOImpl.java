package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.MeasurementGoal;
import grid.entities.Metric;
import grid.interfaces.DAO.MetricDAO;

@Repository //TODO remove comment when using spring, this annotates a DAO for the framework
public class MetricDAOImpl implements MetricDAO {

	private static final Logger logger	=	LoggerFactory.getLogger(MetricDAOImpl.class);
	private SessionFactory		sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addMetric(Metric m) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.persist(m);
		logger.info("added a new Metric on persistence layer");	
	}

	@Override
	public void updateMetric(Metric m) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.update(m);
		logger.info("updated a Metric on persistence layer");		
	}

	@Override
	public List<Metric> listMetrics() {
		Session session				=	this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Metric> metricList	=	session.createQuery("from Metric").list();
		for(Metric g : metricList){
			logger.info("MeasurementGoal List::"+g);
		}
		return metricList;
	}

	@Override
	public Metric getMetricById(int id) {
		Session currentSession	=	this.sessionFactory.getCurrentSession();
		Metric	m			=	(Metric) currentSession.load(Metric.class,new Integer(id));
		logger.info("Metric loaded::"+m);
		return m;
	}

	@Override
	public List<Metric> getMetricLog(String label) {
		Session session				=	this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Metric> metricList	=	session.createQuery("from Metric G where G.label = "+label).list();
		for(Metric g : metricList){
			logger.info("Metric List::"+g);
		}
		return metricList;
	}

	@Override
	public void removeMetric(int id) {
		Session session	=	this.sessionFactory.getCurrentSession();
		Metric m			=	(Metric)	session.load(Metric.class, new Integer(id));
		if(m!=null){
			session.delete(m);
		}
		logger.info("MeasurementGoal deleted successfully");
	}


}
