package grid.entities;

import java.util.ArrayList;

import grid.interfaces.Updatable;
/**
 * Class modeling a Measurement goal element on GQM+S Grid
 * @author Paride Casulli
 * @author Lorenzo La Banca
 *
 */
public class MeasurementGoal extends GridEntity implements Updatable{
	String description;
	String interpretationModel;
	ArrayList<Question> questionList;
	
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


	public ArrayList<Question> getQuestionList() {
		return questionList;
	}


	public void setQuestionList(ArrayList<Question> questionList) {
		this.questionList = questionList;
	}


	@Override
	public ArrayList<GridEntity> update(GridEntity ge) {
		// TODO Auto-generated method stub
		return null;
	}

}
