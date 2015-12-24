package grid.entities;

import java.util.ArrayList;

import grid.interfaces.Updatable;

public class Grid implements Updatable{
	public String 					version;
	private ArrayList<Goal> 		mainGoals				=	null;
	private ArrayList<GridElement> 	elementsOfGrid	=	null;
	private Project					project;
	private ArrayList<String>		activityList;
	private ArrayList<String>		dataEntryList;
	private ArrayList<String>		fMessageList;
	private ArrayList<String>		spList;
	private ArrayList<String>		tsList;
	

	@Override
	public ArrayList<GridElement> update(GridElement ge) {
		// TODO Auto-generated method stub
		return null;
	}
}
