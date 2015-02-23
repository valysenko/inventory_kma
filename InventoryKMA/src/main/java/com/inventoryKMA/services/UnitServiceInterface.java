package com.inventoryKMA.services;

import java.util.ArrayList;

import com.inventoryKMA.entities.Unit;

public interface UnitServiceInterface {
	public void getUnit(int id);
	public void deleteUnit(int id);
	public ArrayList<Unit> getUnits(); 
}
