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

import grid.interfaces.Updatable;
/**
 * Class modeling a Measurement goal element on GQM+S Grid
 * @author Paride Casulli
 * @author Lorenzo La Banca
 *
 */
@Entity
@Table(name="MeasurementGoal")
public class MeasurementGoal extends GridEntity implements Updatable{
	String description			=	"";
	String interpretationModel	=	"";
	List<Question> questionList	=	new ArrayList<Question>();
	
	/**
	 * returns a description of the measurement goal
	 * @return description string
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * sets a description for this measurement goal
	 * @param description string
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	public String getInterpretationModel() {
		return interpretationModel;
	}


	public void setInterpretationModel(String interpretationModel) {
		this.interpretationModel = interpretationModel;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "MeasurementGoalToQuestion", joinColumns = { 
			@JoinColumn(name = "goalID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "quesID", 
					nullable = false, updatable = false) })
	public List<Question> getQuestionList() {
		return questionList;
	}


	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}


	@Override
	public ArrayList<GridEntity> update(GridEntity ge) {
		// TODO Auto-generated method stub
		return null;
	}

}
