package grid.entities;

import java.util.ArrayList;

import grid.interfaces.Updatable;

public class MeasurementGoal extends GridEntity implements Updatable{
	String description;
	String interpretationModel;
	ArrayList<Question> questionList;
	
	
	public String getDescription() {
		return description;
	}


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
