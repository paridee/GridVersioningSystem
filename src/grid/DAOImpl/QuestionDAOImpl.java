package grid.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import grid.entities.Metric;
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
	public void addQuestion(Question q) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.persist(q);
		logger.info("added a new Question on persistence layer");	
	}

	@Override
	public void updateQuestion(Question q) {
		Session	session	=	this.sessionFactory.getCurrentSession();
		session.update(q);
		logger.info("updated a Question on persistence layer");		
	}

	@Override
	public List<Question> listQuestion() {
		Session session				=	this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Question> questionList	=	session.createQuery("from Question").list();
		for(Question g : questionList){
			logger.info("Question List::"+g);
		}
		return questionList;
	}

	@Override
	public Question getQuestionById(int id) {
		Session currentSession	=	this.sessionFactory.getCurrentSession();
		Question	m			=	(Question) currentSession.load(Question.class,new Integer(id));
		logger.info("Question loaded::"+m);
		return m;
	}

	@Override
	public List<Question> getQuestionLog(String label) {
		Session session				=	this.sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Question> questionList	=	session.createQuery("from Question Q where Q.label = "+label).list();
		for(Question g : questionList){
			logger.info("Question List::"+g);
		}
		return questionList;
	}

	@Override
	public void removeQuestion(int id) {
		Session session	=	this.sessionFactory.getCurrentSession();
		Question m			=	(Question)	session.load(Question.class, new Integer(id));
		if(m!=null){
			session.delete(m);
		}
		logger.info("Question deleted successfully");
	}

}
