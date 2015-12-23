package grid.entities;

import java.util.ArrayList;

import grid.interfaces.Updatable;

public class Question extends GridEntity implements Updatable{

	private ArrayList<Metric> 	metricList;
	private String 				question;
	
	public ArrayList<Metric> getMetricList() {
		return metricList;
	}


	public void setMetricList(ArrayList<Metric> metricList) {
		this.metricList = metricList;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public ArrayList<GridEntity> update(GridEntity ge) {
		// TODO Auto-generated method stub
		return null;
	}

}
