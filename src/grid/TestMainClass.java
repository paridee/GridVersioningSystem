package grid;

import org.hibernate.Session;

import grid.entities.Goal;
import grid.entities.Metric;

public class TestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Che Dio ci assista...");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Metric testm	=	new Metric();
		testm.setDescription("pippo");
		testm.setLabel("goal1");
		testm.setVersion("1.0.0");
		/*Goal test	=	new Goal();
		test.setDescription("pippo");
		test.setContext("pasquale");
		test.setAssumption("peppino");*/
		session.save(testm);
		session.getTransaction().commit();
		System.out.println("Amen");

	}

}
