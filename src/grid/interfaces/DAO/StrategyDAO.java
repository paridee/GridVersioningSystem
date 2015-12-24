package grid.interfaces.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Strategy;

public interface StrategyDAO {
	public void addStrategy(Strategy g);
	public void updateStrategy(Strategy p);
	public List<Strategy> listStrategy();
	public Strategy getStrategyById(int id);
	public List<Strategy> getStrategyLog(String label);
	public void removeStrategy(int id);
	public void setSessionFactory(SessionFactory sessionFactory);
}
