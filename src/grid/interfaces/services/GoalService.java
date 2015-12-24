package grid.interfaces.services;

import java.util.ArrayList;
import java.util.List;

import grid.entities.Goal;

public interface GoalService {
	public void addGoal(Goal g);
	public Goal update(Goal g);
	public List<Goal> listGoals();
	public Goal getGoalById(int id);
	public ArrayList<Goal> getGoalLog(String label);
	public void removeGoal(int id);
}
