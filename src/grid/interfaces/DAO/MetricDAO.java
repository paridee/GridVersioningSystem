package grid.interfaces.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Metric;

public interface MetricDAO {
	public void addMetric(Metric g);
	public void updateMetric(Metric p);
	public List<Metric> listMetrics();
	public Metric getMetricById(int id);
	public ArrayList<Metric> getMetricLog(String label);
	public void removeMetric(int id);
	public void setSessionFactory(SessionFactory sessionFactory);
}
