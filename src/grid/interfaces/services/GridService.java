package grid.interfaces.services;

import java.util.List;

import grid.entities.Grid;
import grid.entities.GridElement;

public interface GridService {
	Grid loadFromJson(String json);
	public void addGrid(Grid g);
	public void updateGrid(Grid p);
	public Grid upgradeGrid(Grid p);
	public List<Grid> listAllGrids();
	public Grid getGridById(int id);
	public Grid getLatestGrid(int projid);
	public List<Grid> getGridLog(int projid);
	public Grid updateGridElement(Grid g,GridElement ge);
	public void removeGrid(int id);
}
