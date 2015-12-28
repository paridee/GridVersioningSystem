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
@Table(name="Question")
public class Question extends GridElement implements Updatable{

	private List<Metric> 	metricList	=	new ArrayList();
	private String 				question;
	
	@ManyToMany(cascade = CascadeType.ALL)
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
	public ArrayList<GridElement> update(GridElement ge) {
		Question updated	=	(Question) this.clone();
		updated.setVersion(this.getVersion()+1);
		ArrayList<GridElement> returnList	=	new ArrayList<GridElement>();
		boolean addThis						=	false;	
		for(int i=0;i<this.metricList.size();i++){
			if(this.metricList.get(i).getLabel().equals(ge.getLabel())){
				updated.metricList.set(i, (Metric) ge);
				addThis=true;
			}
		}
		for(int i=0;i<this.metricList.size();i++){
			Utils.mergeLists(returnList, this.metricList.get(i).update(ge));
		}
		if(addThis==true){
			returnList.add(updated);
		}
		return returnList;
	}


	@Override
	public GridElement clone() {
		Question cloned	=	new Question();
		cloned.setLabel(this.label);
		cloned.setVersion(this.version);
		List<Metric> clonedList	=	new ArrayList<Metric>();
		for(int i=0;i<this.metricList.size();i++){
			clonedList.add(metricList.get(i));
		}
		cloned.setMetricList(clonedList);
		cloned.setQuestion(this.question);
		return cloned;
	}

}
