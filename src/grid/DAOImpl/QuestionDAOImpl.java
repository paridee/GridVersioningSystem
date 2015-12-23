package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Question;
import grid.interfaces.DAO.QuestionDAO;

public class QuestionDAOImpl implements QuestionDAO {

	@Override
	public void addQuestion(Question g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQuestion(Question p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> listQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question getQuestionById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Question> getQuestionLog(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeQuestion(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		
	}

}
