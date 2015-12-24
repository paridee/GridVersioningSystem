package grid;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import grid.entities.Goal;
import grid.entities.MeasurementGoal;
import grid.entities.Metric;
import grid.entities.Question;
import grid.entities.Strategy;

public class HibernateUtil {
    
    private static SessionFactory sessionFactory;
     
    static{
        try {
        	Configuration fConfiguration	=	new Configuration();
        	fConfiguration.addAnnotatedClass(Metric.class);
        	fConfiguration.addAnnotatedClass(Goal.class);
        	fConfiguration.addAnnotatedClass(Question.class);
        	fConfiguration.addAnnotatedClass(Strategy.class);
        	fConfiguration.addAnnotatedClass(MeasurementGoal.class);;
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
