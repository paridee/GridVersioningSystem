package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

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
	public void addMetric(Metric g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMetric(Metric p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Metric> listMetrics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Metric getMetricById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Metric> getMetricLog(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeMetric(int id) {
		// TODO Auto-generated method stub
		
	}


}
