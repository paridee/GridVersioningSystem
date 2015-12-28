package grid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.FlushMode;
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
		session.beginTransaction();
		
		GridServiceImpl merdaService	=	new GridServiceImpl();
		GridDAOImpl gDAO	=	new GridDAOImpl();
		GridElementServiceImpl elService	=	new GridElementServiceImpl();
		GridElementDAOImpl	elDao	=	new GridElementDAOImpl();
		elDao.setSessionFactory(sessionF);
		elService.setGridElementDAO(elDao);
		merdaService.setGridElementService(elService);
		gDAO.setSessionFactory(sessionF);
		merdaService.setGridDAO(gDAO);

		
		// test load grid da JSON
		/*
		String everything	=	"";
		try(BufferedReader br = new BufferedReader(new FileReader("grid.txt"))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Grid testGrid	=	JSONFactory.loadFromJson(everything);
		gDAO.setSessionFactory(sessionF);
		merdaService.setGridDAO(gDAO);
		merdaService.addGrid(testGrid);*/
		
		
		
		//load Grid da DB
		
		
		List<Grid> pippo	=	merdaService.listAllGrids();
		System.out.println("Grid caricate "+pippo.size());
		Grid testupdate	=	null;
		for(int i=0;i<pippo.size();i++){
			Grid iesima	=	pippo.get(i);
			List<Goal> listagoal	=	iesima.getMainGoals();
			System.out.println("Grid numero "+i+" caricati "+listagoal.size()+" goals");
			for(int j=0;j<listagoal.size();j++){
				System.out.println("Grid numero "+i+" goal numero "+j+" caricate "+listagoal.get(j).getStrategyList().size()+" strategies");
			}
			testupdate	=	iesima;
		}
		
		
		/*
		System.out.println("Open Session: "+session);
		Session session2		=	sessionF.getCurrentSession();
		System.out.println("Open Session 2:"+session2+" "+(session2==session));
		Session session3		=	sessionF.getCurrentSession();
		System.out.println("Open Session 3:"+session3+" "+(session2==session3)+" "+(session==session3));
		
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
		serv.upgradeGridElement(testg);*/
		
		//session.getTransaction().commit();
		
		
		
		
		List<Goal> goals	=	testupdate.getMainGoals();
		System.out.println("CARICATO "+goals.size()+" GOALS");
		for(int i=0;i<goals.size();i++){
			System.out.println(goals.get(i).getLabel());
			if(goals.get(i).getLabel().equals("g1")){
				System.out.println(goals.get(i).getLabel()+" TROVATO");
				List<Strategy> strategies	=	goals.get(i).getStrategyList();
				for(int j=0;j<strategies.size();j++){
					if(strategies.get(j).getLabel().equals("s1")){
						List<Goal> goalsInf	=	strategies.get(j).getGoalList();
						for(int k=0;k<goalsInf.size();k++){
							if(goalsInf.get(k).getLabel().equals("g2")){
								Goal clone	=	(Goal)goalsInf.get(k).clone();
								clone.setDescription("modificatoTEST");
								System.out.println("Aggiorno");
								Grid newGrid	=	merdaService.updateGridElement(testupdate, clone);
								strategies.get(j).setDescription("non deve salvare questo");
								System.out.println("Aggiornato");
							}
						}
					}
				}
			}
		}
		session.getTransaction().commit();
		System.out.println("Amen");

	}

}
