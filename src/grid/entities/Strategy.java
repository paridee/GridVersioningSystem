package grid.entities;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

import grid.interfaces.Updatable;

@Entity
@Table(name="Strategy")
public class Strategy extends GridEntity implements Updatable{
	
	private String 			description;
	private boolean			isTerminal	=	false;	//TODO manage boolean
	private String			strategicProjectId;
	//private ArrayList<Goal>	goalList;
	
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getIsTerminal() {
		return isTerminal;
	}


	public void setIsTerminal(boolean isTerminal) {
		this.isTerminal = isTerminal;
	}


	public String getStrategicProjectId() {
		return strategicProjectId;
	}


	public void setStrategicProjectId(String strategicProjectId) {
		this.strategicProjectId = strategicProjectId;
	}

/*
	public ArrayList<Goal> getGoalList() {
		return goalList;
	}


	public void setGoalList(ArrayList<Goal> goalList) {
		this.goalList = goalList;
	}*/


	@Override
	public ArrayList<GridEntity> update(GridEntity ge) {
		// TODO Auto-generated method stub
		return null;
	}

}
