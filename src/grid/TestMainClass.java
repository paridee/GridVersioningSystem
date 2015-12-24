package grid;

import java.util.List;

import org.hibernate.Session;

import grid.entities.Goal;
import grid.entities.MeasurementGoal;
import grid.entities.Metric;
import grid.entities.Question;
import grid.entities.Strategy;

public class TestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Che Dio ci assista...");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Metric testm	=	new Metric();
		testm.setDescription("pippo");
		testm.setLabel("metric1");
		testm.setVersion("1.0.0");
		Goal testg		=	new Goal();
		testg.setDescription("pippogoal");
		testg.setLabel("goal1");
		testg.setVersion("1.0.0");
		MeasurementGoal testmg	=	new MeasurementGoal();
		testmg.setDescription("pippoMgoal");
		testmg.setLabel("mg1");
		testmg.setVersion("1.0.0");
		testg.setMeasurementGoal(testmg);
		Question testq	=	new Question();
		testq.setLabel("qu1");
		testq.setVersion("1.0.0");
		Strategy tests	=	new Strategy();
		tests.setLabel("str1");
		tests.setVersion("1.0.0");
		List str	=	testg.getStrategyList();
		str.add(tests);
		/*Goal test	=	new Goal();
		test.setDescription("pippo");
		test.setContext("pasquale");
		test.setAssumption("peppino");*/
		session.save(tests);
		session.save(testg);
		session.save(testq);
		session.save(testm);
		session.save(testmg);
		session.getTransaction().commit();
		System.out.println("Amen");

	}

}
