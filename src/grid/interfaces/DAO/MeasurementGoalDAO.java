package grid.interfaces.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.MeasurementGoal;

public interface MeasurementGoalDAO {
	public void addGoal(MeasurementGoal g);
	public void updateGoal(MeasurementGoal p);
	public List<MeasurementGoal> listGoals();
	public MeasurementGoal getGoalById(int id);
	public List<MeasurementGoal> getGoalLog(String label);
	public void removeGoal(int id);
	public void setSessionFactory(SessionFactory sessionFactory);
}
