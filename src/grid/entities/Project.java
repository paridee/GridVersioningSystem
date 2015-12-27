package grid.entities;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	
	private int id;
	private String projectId;
	private String description;
	private String creationDate;
	List<String> availableMeasUnits;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	@ElementCollection
	@CollectionTable(name="ProjectMeasUnits", joinColumns=@JoinColumn(name="projID"))
	@Column(name="measUnit")
	public List<String> getAvailableMeasUnits() {
		return availableMeasUnits;
	}
	public void setAvailableMeasUnits(List<String> availableMeasUnits) {
		this.availableMeasUnits = availableMeasUnits;
	}
}
