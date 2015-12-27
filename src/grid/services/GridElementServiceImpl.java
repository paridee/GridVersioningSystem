package grid.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import grid.entities.Goal;
import grid.entities.GridElement;
import grid.interfaces.DAO.GridElementDao;
import grid.interfaces.services.GridElementService;

@Service
public class GridElementServiceImpl implements GridElementService {

	private GridElementDao gridElementDao;
	
	public void setGoalDAO(GridElementDao gDAO) {
		this.gridElementDao = gDAO;
	}

	@Override
	@Transactional
	public void addGridElement(GridElement e) {
		this.gridElementDao.addGridElement(e);
	}

	@Override
	@Transactional
	public void updateGridElement(GridElement e) {
		this.gridElementDao.updateGridElement(e);	
	}

	@Override
	@Transactional
	public GridElement upgradeGridElement(GridElement e) {
		GridElement upgraded	=	e.clone();
		upgraded.setVersion(upgraded.getVersion()+1);
		this.gridElementDao.addGridElement(upgraded);
		return upgraded;
	}

	@Override
	public List<GridElement> listElement(Class c) {
		return this.gridElementDao.listElement(c);
	}

	@Override
	public GridElement getElementById(int id, Class c) {
		return this.gridElementDao.getElementById(id, c);
	}

	@Override
	public List<GridElement> getElementLog(String label, Class c) {
		return this.gridElementDao.getElementLog(label, c);
	}

	@Override
	@Transactional
	public void removeElement(int id, Class c) {
		this.gridElementDao.removeElement(id, c);
		
	}

	

}
