package grid.interfaces.services;

import java.util.ArrayList;
import java.util.List;

import grid.entities.Goal;
import grid.entities.GridElement;

public interface GridElementService {
	public void addGridElement(GridElement e);
	public void updateGridElement(GridElement e);
	public GridElement upgradeGridElement(GridElement e);
	public List<GridElement> listElement(Class c);
	public GridElement getElementById(int id,Class c);
	public List<GridElement> getElementLog(String label,Class c);
	public void removeElement(int id,Class c);
}
