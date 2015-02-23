package com.inventoryKMA.services;

import java.util.ArrayList;

import com.inventoryKMA.entities.Workplace;


public interface WorkplaceServiceInterface {
	public void getWorkplace(int id);
	public void deleteWorkplace(int id);
	public ArrayList<Workplace> getWorkplaces(); 
}
