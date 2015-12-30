package grid;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import grid.entities.Goal;
import grid.entities.Grid;
import grid.entities.MeasurementGoal;
import grid.entities.Metric;
import grid.entities.Project;
import grid.entities.Question;
import grid.entities.Strategy;

public class HibernateUtil {
    
	/**
	 * Utility singleton class, creates a factory for a Hibernate session, configures It with a list of annotated class
	 * @author Paride Casulli
	 * @author Lorenzo La Banca
	 */
    private static SessionFactory sessionFactory;
     
    static{
        try {
        	Configuration fConfiguration	=	new Configuration();
        	fConfiguration.addAnnotatedClass(Metric.class);
        	fConfiguration.addAnnotatedClass(Goal.class);
        	fConfiguration.addAnnotatedClass(Question.class);
        	fConfiguration.addAnnotatedClass(Strategy.class);
        	fConfiguration.addAnnotatedClass(MeasurementGoal.class);
        	fConfiguration.addAnnotatedClass(Grid.class);
        	fConfiguration.addAnnotatedClass(Project.class);
            sessionFactory = fConfiguration.configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }
 
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
     
    public static void shutDown(){
        //closes caches and connections
        getSessionFactory().close();
    }
}
