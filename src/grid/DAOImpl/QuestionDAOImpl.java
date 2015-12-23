package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.Question;
import grid.interfaces.DAO.QuestionDAO;

@Repository //TODO remove comment when using spring, this annotates a DAO for the framework
public class QuestionDAOImpl implements QuestionDAO {
	
	private static final Logger logger	=	LoggerFactory.getLogger(QuestionDAOImpl.class);
	private SessionFactory		sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
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

}
