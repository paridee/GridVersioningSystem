package grid.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import grid.interfaces.Updatable;

/**
 * 
 * @author Paride Casulli
 * @author Lorenzo La Banca
 *
 * This class models a Goal entity on a Grid
 */

@Entity
@Table(name="Goal")
public class Goal extends GridElement implements Updatable{
	@Column(name="assumption")
	private String 				assumption		=	"";
	@Column(name="context")
	private	String 				context			=	"";
	@Column(name="description")
	private String 				description		=	"";
	
	private MeasurementGoal		measurementGoal	=	null;
	
	private List<Strategy> 		strategyList	=	new ArrayList<Strategy>();
	
	/**
	 * Returns a goal assumption
	 * @return string assumption
	 */
	public String getAssumption() {
		return assumption;
	}

	/**
	 * Sets a Goal assumption getting a String
	 * @param assumption assumption string
	 */
	public void setAssumption(String assumption) {
		this.assumption = assumption;
	}

	/**
	 * Returns context factors for this goal in string format
	 * @return context factor
	 */
	public String getContext() {
		return context;
	}

	/**
	 * Sets context factor for this goal
	 * @param context string representing the context factor
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * Returns a description for this goal
	 * @return string description of the goal
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets a description for this goal
	 * @param description string description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Returns a measurement goal referenced for this goal
	 * @return measurement goal instance
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="measurementGoal")
	public MeasurementGoal getMeasurementGoal() {
		return measurementGoal;
	}

	/**
	 * Sets a measurement goal for this object
	 * @param measurementGoal measurement goal to be set for this goal
	 */
	public void setMeasurementGoal(MeasurementGoal measurementGoal) {
		this.measurementGoal = measurementGoal;
	}

	/**
	 * Returns the list of strategies for this goal
	 * @return list of strategies
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "GoalToStrategyList", joinColumns = { 
			@JoinColumn(name = "goalID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "strID", 
					nullable = false, updatable = false) })
	public List<Strategy> getStrategyList() {
		return strategyList;
	}

	/**
	 * Sets the list of strategies for this goal
	 * @param strategyList list of strategies to be assigned for this goal
	 */
	public void setStrategyList(List<Strategy> strategyList) {
		this.strategyList = strategyList;
	}


	@Override
	public ArrayList<GridElement> update(GridElement ge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GridElement clone() {
		// TODO Auto-generated method stub
		Goal newGoal	=	new Goal();
		newGoal.setLabel(this.label);
		newGoal.setVersion(this.version);
		newGoal.setAssumption(this.assumption);
		newGoal.setContext(this.context);
		newGoal.setDescription(this.description);
		newGoal.setMeasurementGoal(this.measurementGoal);
		List<Strategy> clonedList	=	new ArrayList<Strategy>();
		for(int i=0;i<this.strategyList.size();i++){
			clonedList.add(strategyList.get(i));
		}
		newGoal.setStrategyList(clonedList);
		return newGoal;
	}

}
