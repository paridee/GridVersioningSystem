package grid.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import grid.interfaces.Updatable;

@Entity
@Table(name="Grid")
public class Grid implements Updatable{

	private int id;
	public int 			version=1; //TODO make String Version
	private List<Goal> 	mainGoals				=	null;
	private Project		project;
	//TODO mancano attributi della grid di Serena e Marco
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}	
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "GridToRootGoal", joinColumns = { 
			@JoinColumn(name = "gridID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "goalID", 
					nullable = false, updatable = false) })
	public List<Goal> getMainGoals() {
		return mainGoals;
	}


	public void setMainGoals(List<Goal> mainGoals) {
		this.mainGoals = mainGoals;
	}

	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="projID")
	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public ArrayList<GridElement> update(GridElement ge) {
		// TODO Auto-generated method stub
		return null;
	}
}
