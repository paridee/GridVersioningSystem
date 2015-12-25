package grid;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import grid.DAOImpl.GridDAOImpl;
import grid.DAOImpl.GridElementDAOImpl;
import grid.entities.Goal;
import grid.entities.Grid;
import grid.entities.MeasurementGoal;
import grid.entities.Metric;
import grid.entities.Project;
import grid.entities.Question;
import grid.entities.Strategy;
import grid.interfaces.services.GridService;
import grid.services.GridElementServiceImpl;
import grid.services.GridServiceImpl;

public class TestMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Che Dio ci assista...");
		SessionFactory sessionF = HibernateUtil.getSessionFactory();
		Session session			=	sessionF.getCurrentSession();
		System.out.println("Open Session: "+session);
		Session session2		=	sessionF.getCurrentSession();
		System.out.println("Open Session 2:"+session2+" "+(session2==session));
		Session session3		=	sessionF.getCurrentSession();
		System.out.println("Open Session 3:"+session3+" "+(session2==session3)+" "+(session==session3));
		session.beginTransaction();
		Goal testg		=	new Goal();
		testg.setDescription("pippogoal");
		testg.setLabel("goal1");
		GridElementDAOImpl	gdao	=	new GridElementDAOImpl();
		GridElementServiceImpl	serv	=	new GridElementServiceImpl();
		gdao.setSessionFactory(sessionF);
		serv.setGoalDAO(gdao);
		Project stocazzo	=	new Project();
		stocazzo.setDescription("mannaggia il bambinello");
		Grid merda			=	new Grid();
		merda.setProject(stocazzo);
		serv.addGridElement(testg);
		Metric testm	=	new Metric();
		testm.setDescription("pippo");
		testm.setLabel("metric1");
		testg		=	new Goal();
		testg.setDescription("pippogoal");
		testg.setLabel("goal1");
		ArrayList<Goal> merdaGoals	=	new ArrayList<Goal>();
		merdaGoals.add(testg);
		merda.setMainGoals(merdaGoals);
		GridServiceImpl merdaService	=	new GridServiceImpl();
		GridDAOImpl gDAO	=	new GridDAOImpl();
		gDAO.setSessionFactory(sessionF);
		merdaService.setGridDAO(gDAO);
		merdaService.addGrid(merda);
		MeasurementGoal testmg	=	new MeasurementGoal();
		testmg.setDescription("pippoMgoal");
		testmg.setLabel("mg1");
		testg.setMeasurementGoal(testmg);
		Question testq	=	new Question();
		testq.setLabel("qu1");
		Strategy tests	=	new Strategy();
		tests.setLabel("str1");
		List<Strategy> str	=	testg.getStrategyList();
		str.add(tests);
		testg.setStrategyList(str);
		Goal test	=	new Goal();
		test.setDescription("pippo");
		test.setContext("pasquale");
		test.setAssumption("peppino");
		serv.addGridElement(testm);
		serv.addGridElement(testg);
		serv.addGridElement(testmg);
		serv.addGridElement(testq);
		serv.addGridElement(tests);
		serv.upgradeGridElement(testg);
		session.getTransaction().commit();
		System.out.println("Amen");

	}

}
