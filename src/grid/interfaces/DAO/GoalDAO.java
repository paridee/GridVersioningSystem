package grid.interfaces.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Goal;

public interface GoalDAO {
	public void addGoal(Goal g);
	public void updateGoal(Goal p);
	public List<Goal> listGoals();
	public Goal getGoalById(int id);
	public ArrayList<Goal> getGoalLog(String label);
	public void removeGoal(int id);
	public void setSessionFactory(SessionFactory sessionFactory);
}
