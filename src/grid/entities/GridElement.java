package grid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;

import grid.Utils;

/**
 * This abstract class contains all the common elements among all elements belonging to every element of the Grid
 * @author Paride Casulli
 * @author Lorenzo La Banca
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class GridElement {
	
	@Column(name = "label", nullable = false, length = 20)
	protected String 	label;
	
	protected int 		idElement;	//primary key
	
	@Column(name = "version", nullable = false, length = 20)
	protected int 	version=1;
	
	/**
	 * returns a label for this Grid Entity (in Grid is named as ID, depending on the type of Element
	 * @return label of this element
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * sets a label for this element
	 * @param label to be set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	/**
	 * returns the element ID (primary key on DB)
	 * @return
	 */
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.TABLE)
	public int getIdElement() {
		return idElement;
	}
	
	/**
	 * sets an Id for this element
	 * @param idElement
	 */
	public void setIdElement(int idElement) {
		this.idElement = idElement;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	public abstract GridElement clone();
	
}
