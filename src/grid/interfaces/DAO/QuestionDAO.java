package grid.interfaces.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import grid.entities.Question;

public interface QuestionDAO {
	public void addQuestion(Question g);
	public void updateQuestion(Question p);
	public List<Question> listQuestion();
	public Question getQuestionById(int id);
	public ArrayList<Question> getQuestionLog(String label);
	public void removeQuestion(int id);
	public void setSessionFactory(SessionFactory sessionFactory);
}
