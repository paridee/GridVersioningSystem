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

@Entity
@Table(name="Question")
public class Question extends GridEntity implements Updatable{

	private List<Metric> 	metricList	=	new ArrayList();
	private String 				question;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "QuestionToMetric", joinColumns = { 
			@JoinColumn(name = "quesID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "metrID", 
					nullable = false, updatable = false) })
	public List<Metric> getMetricList() {
		return metricList;
	}


	public void setMetricList(List<Metric> metricList) {
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
