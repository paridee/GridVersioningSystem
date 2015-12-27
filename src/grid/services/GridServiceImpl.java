package grid.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import grid.entities.Grid;
import grid.interfaces.DAO.GridDAO;
import grid.interfaces.DAO.GridElementDao;
import grid.interfaces.services.GridService;

public class GridServiceImpl implements GridService {
	private GridDAO gridDao;
	
	public void setGridDAO(GridDAO dao){
		this.gridDao	=	dao;
	}
	
	@Override
	public Grid loadFromJson(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void addGrid(Grid g) {
		this.gridDao.addGrid(g);
	}

	@Override
	@Transactional
	public void updateGrid(Grid g) {
		this.gridDao.updateGrid(g);
	}

	@Override
	@Transactional
	public void upgradeGrid(Grid p) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Grid> listAllGrids() {
		return this.gridDao.listAllGrids();
	}

	@Override
	public Grid getGridById(int id) {
		return this.gridDao.getGridById(id);
	}

	@Override
	public Grid getLatestGrid(int projid) {
		return this.gridDao.getGridById(projid);
	}

	@Override
	public List<Grid> getGridLog(int projid) {
		return this.gridDao.getGridLog(projid);
	}

	@Override
	public void removeGrid(int id) {
		this.gridDao.removeGrid(id);
	}

}
