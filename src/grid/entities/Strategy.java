package grid.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import grid.Utils;
import grid.interfaces.Updatable;

@Entity
@Table(name="Strategy")
public class Strategy extends GridElement implements Updatable{
	
	private String 			description;
	private boolean			isTerminal	=	false;
	private String			strategicProjectId;
	private List<Goal>		goalList;
	
	
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

	@ManyToMany(	cascade 	= 	CascadeType.ALL)
	@JoinTable(		name 		= 	"StrategyToGoalList", 
					joinColumns = 	{ 
							@JoinColumn(name 		= 	"strID", 
										nullable 	= 	false, 
										updatable 	= 	false) 
							}, 
					inverseJoinColumns	= { 
							@JoinColumn(name 		= 	"goalID", 
										nullable 	= 	false, 
										updatable 	= 	false) 
							})
	public List<Goal> getGoalList() {
		return goalList;
	}


	public void setGoalList(List<Goal> goalList) {
		this.goalList = goalList;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ArrayList<GridElement> update(GridElement ge) {
		Strategy updated	=	(Strategy)this.clone();
		updated.setVersion(this.getVersion()+1);
		ArrayList<GridElement> returnList	=	new ArrayList<GridElement>();
		boolean addThis						=	false;	
		for(int i=0;i<this.goalList.size();i++){
			if(this.goalList.get(i).getLabel().equals(ge.getLabel())){
				updated.goalList.set(i, (Goal) ge);
				addThis=true;
			}
		}
		for(int i=0;i<this.goalList.size();i++){
			Utils.mergeLists(returnList, this.goalList.get(i).update(ge));
		}
		if(addThis==true){
			returnList.add(updated);
		}
		return returnList;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GridElement clone() {
		Strategy cloned	=	new Strategy();
		cloned.setLabel(this.label);
		cloned.setVersion(this.version);
		cloned.setDescription(this.description);
		List<Goal> clonedList	=	new ArrayList<Goal>();
		for(int i=0;i<this.goalList.size();i++){
			clonedList.add(goalList.get(i));
		}
		cloned.setGoalList(clonedList);
		cloned.setIsTerminal(this.isTerminal);
		cloned.setStrategicProjectId(this.strategicProjectId);
		return cloned;		
	}

}
