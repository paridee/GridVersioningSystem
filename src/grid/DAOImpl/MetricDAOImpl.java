package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Metric;
import grid.interfaces.DAO.MetricDAO;

public class MetricDAOImpl implements MetricDAO {

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

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		
	}

}
