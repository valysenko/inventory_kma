package com.inventoryKMA.services;

import java.util.ArrayList;

import com.inventoryKMA.entities.Classroom;

public interface ClassroomServiceInterface {
	public void getClassroom(int id);
	public void deleteClassroom(int id);
	public ArrayList<Classroom> getClassrooms(); 
}
