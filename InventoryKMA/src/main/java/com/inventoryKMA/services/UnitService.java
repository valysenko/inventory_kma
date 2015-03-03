package com.inventoryKMA.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.inventoryKMA.DAO.UnitDAO;
import com.inventoryKMA.entities.Unit;

public class UnitService implements UnitServiceInterface{
	
	@Autowired
	private UnitDAO unitDao;

	
	public void addUnit(Unit unit){
		if (
				(unit!=null)&&
				(unit.getName()!=null)&&
				(!"".equals(unit.getName())&&
						(!"".equals(unit.getNumber()))
								)
								){
			unitDao.addUnit(unit);
		}

	}
	
	public void getUnit(int id) {
		unitDao.getUnit(id);
	}

	public void deleteUnit(int id) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Unit> getUnits() {
		// TODO Auto-generated method stub
		return null;
	}

}
