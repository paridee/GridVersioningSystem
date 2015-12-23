package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Goal;
import grid.interfaces.DAO.GoalDAO;

public class GoalDAOImpl implements GoalDAO {

	@Override
	public void addGoal(Goal g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGoal(Goal p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Goal> listGoals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goal getGoalById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Goal> getGoalLog(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeGoal(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		
	}

}
